package com.panasonic.app.service;
import com.panasonic.app.exception.ServiceFoundException;
import com.panasonic.app.model.Data;
import com.panasonic.app.model.DragonBall;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

@Service
public class DragonBallService {

    @Value("${url.dragonBall}")
    private String url;

    private final RestTemplate restTemplate;

    public DragonBallService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder
                .setConnectTimeout(Duration.ofMillis(1000))
                .setReadTimeout(Duration.ofMillis(1000))
                .build();
    }


    public Data listALLDragonBall() {

        Data data;
        try{
            data=readService();
        }catch (Exception e){
            throw new ServiceFoundException();
        }

        return data;
    }


    private Data readService() throws Exception{
        Data data;
        DragonBall[] arrayDragonBall;
        List<DragonBall> listDragonBall;

        arrayDragonBall=obtenerData();
        listDragonBall =transformArray(arrayDragonBall);
        data = guardarData(listDragonBall);

        return data;
    }

    private  DragonBall[] obtenerData(){
        DragonBall[] arrayDragonBall = this.restTemplate.getForObject(url, DragonBall[].class);
        return  arrayDragonBall;
    }

    private  List<DragonBall> transformArray(DragonBall[] arrayDragonBall){

        List<DragonBall> listDragonBall = Arrays.asList(arrayDragonBall);
        return  listDragonBall;
    }
    private Data guardarData(List<DragonBall> listDragonBall){
        Data data = new Data();
        data.setData(listDragonBall);
        return data;
    }
}
