package com.example.edu.fruteria;

import android.net.Uri;
import android.os.Bundle;

import android.view.View;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import androidx.fragment.app.Fragment;


public class TiendaPrincipal extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        FruitsFragment.OnFragmentInteractionListener,
        VegetablesFragment.OnFragmentInteractionListener,
        CartFragment.OnFragmentInteractionListener,
        MainFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienda_principal);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        Fragment fragment = new MainFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.content_tienda, fragment).commit();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tienda_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (item.getItemId()) {
            case R.id.action_home:
                goHome();
                return true;
            case R.id.action_cart:
                goCart();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        Fragment fragment = null;
        boolean fragmentSelected = false;

        if (id == R.id.nav_camera) {
            // Handle the camera action
            fragmentSelected = false;

        } else if (id == R.id.nav_gallery) {

            fragment = new FruitsFragment();
            fragmentSelected = true;

        } else if (id == R.id.nav_slideshow) {
            fragment = new VegetablesFragment();
            fragmentSelected = true;
        } else if (id == R.id.nav_manage) {

        }/* else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }*/

        if(fragmentSelected) {
            getSupportFragmentManager().beginTransaction().replace(R.id.content_tienda,fragment).commit();
        }
        else {
            fragment = new MainFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_tienda, fragment).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void goToFruits(View view){

        getSupportFragmentManager().beginTransaction().replace(R.id.content_tienda, new FruitsFragment()).commit();

    }
    public void goToVegetables(View view){

        getSupportFragmentManager().beginTransaction().replace(R.id.content_tienda, new VegetablesFragment()).commit();

    }
    public void goHome(){

        getSupportFragmentManager().beginTransaction().replace(R.id.content_tienda, new MainFragment()).commit();

    }
    public void goCart(){

        getSupportFragmentManager().beginTransaction().replace(R.id.content_tienda, new CartFragment()).commit();

    }
}
