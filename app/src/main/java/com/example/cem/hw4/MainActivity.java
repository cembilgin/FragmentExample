package com.example.cem.hw4;

import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        final   Button abstractFactoryFragment = (Button)findViewById(R.id.btnAbstractFactory);
        final Button factoryMethod=(Button)findViewById(R.id.btnFactoryMethod);
        final  Button prototype = (Button)findViewById(R.id.btnPrototype);
        final  Button singleton= (Button)findViewById(R.id.btnSingleton);
        final  Button builder =(Button)findViewById(R.id.btnBuilder);
        final TextView title=(TextView)findViewById(R.id.txtTitle);
        abstractFactoryFragment.setVisibility(View.VISIBLE);
        factoryMethod.setVisibility(View.VISIBLE);
        prototype.setVisibility(View.VISIBLE);
        singleton.setVisibility(View.VISIBLE);
        builder.setVisibility(View.VISIBLE);
        title.setText("Creational Design Patterns");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final   Button abstractFactoryFragment = (Button)findViewById(R.id.btnAbstractFactory);
        final Button factoryMethod=(Button)findViewById(R.id.btnFactoryMethod);
        final  Button prototype = (Button)findViewById(R.id.btnPrototype);
        final  Button singleton= (Button)findViewById(R.id.btnSingleton);
        final  Button builder =(Button)findViewById(R.id.btnBuilder);
        final TextView title=(TextView)findViewById(R.id.txtTitle);




        builder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                BuilderFragment newfragment = new BuilderFragment();
                fragmentTransaction.replace(R.id.fragment_container,  newfragment,"Fragment");
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                abstractFactoryFragment.setVisibility(View.INVISIBLE);
                factoryMethod.setVisibility(View.INVISIBLE);
                prototype.setVisibility(View.INVISIBLE);
                singleton.setVisibility(View.INVISIBLE);
                builder.setVisibility(View.INVISIBLE);
                title.setText("Builder Pattern");
            }
        });
        singleton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                SingletonFragment newfragment = new SingletonFragment();
                fragmentTransaction.replace(R.id.fragment_container,  newfragment,"Fragment");
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                abstractFactoryFragment.setVisibility(View.INVISIBLE);
                factoryMethod.setVisibility(View.INVISIBLE);
                prototype.setVisibility(View.INVISIBLE);
                singleton.setVisibility(View.INVISIBLE);
                builder.setVisibility(View.INVISIBLE);
                title.setText("Singleton Pattern");
            }
        });
        prototype.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                PrototypeFragment newfragment = new PrototypeFragment();
                fragmentTransaction.replace(R.id.fragment_container,  newfragment,"Fragment");
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                abstractFactoryFragment.setVisibility(View.INVISIBLE);
                factoryMethod.setVisibility(View.INVISIBLE);
                prototype.setVisibility(View.INVISIBLE);
                singleton.setVisibility(View.INVISIBLE);
                builder.setVisibility(View.INVISIBLE);
                title.setText("Prototype Pattern");
            }
        });
        factoryMethod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FactoryMethodFragment newfragment = new FactoryMethodFragment();
                fragmentTransaction.replace(R.id.fragment_container,  newfragment,"Fragment");
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                abstractFactoryFragment.setVisibility(View.INVISIBLE);
                factoryMethod.setVisibility(View.INVISIBLE);
                prototype.setVisibility(View.INVISIBLE);
                singleton.setVisibility(View.INVISIBLE);
                builder.setVisibility(View.INVISIBLE);
                title.setText("Factory Method Pattern");
            }
        });
        abstractFactoryFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
               FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                AbstractFactoryFragment newfragment = new AbstractFactoryFragment();
                fragmentTransaction.replace(R.id.fragment_container,  newfragment,"Fragment");
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                abstractFactoryFragment.setVisibility(View.INVISIBLE);
                factoryMethod.setVisibility(View.INVISIBLE);
                prototype.setVisibility(View.INVISIBLE);
                singleton.setVisibility(View.INVISIBLE);
                builder.setVisibility(View.INVISIBLE);
                title.setText("Abstract Factory Pattern");

            }
        });
    }

}
