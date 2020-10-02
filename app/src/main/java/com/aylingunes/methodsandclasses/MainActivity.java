package com.aylingunes.methodsandclasses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String username; // global değişkenlere methodlar içinden erişilebilir


    @Override //hazır method üzerine yazılıyor
    protected void onCreate(Bundle savedInstanceState) { // sadece ilk defa oluşma anında çalışıyor
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println( "oncreate called");
        testMethod();
        System.out.println(math(3,5));
        System.out.println(newMethod("aylin "));
        makeSimpsons();

    }
  // aktivitenin yaşam döngüsü içine bakıyoruz. methodlar farklı oluyor ekran değişince yapılacak
  // işlemler belirlenşyor durdurma ya da kapatma seçenekleri olabiliyor.
  //onStop or onPause şeklinde

    public void testMethod(){
        username = "Ali";
        int x = 4+ 4 ;
        System.out.println("value of x : " + x);
    }
 public String newMethod (String string){
        return string + "new method";

 }


    @Override //onresume yaz tıkla sana hazır method getiriyor
    protected void onResume() { // kullanıcı görmeden çağrılır
        super.onResume();
        System.out.println( "onresume called" );
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onstop called");

    }



    public int math (int a, int b) {
// iki sayı alıp toplayıp döndüren method
        return a+b;

    }







    public void makeSimpsons() { // age private olduğu için hemen erişemedik
      Simpsons homer = new Simpsons("homer", 50, "Nuclear")  ;
        System.out.println(homer.getName());
        homer.setName("Homer Simpson");
        System.out.println(homer.getName());
    }





}