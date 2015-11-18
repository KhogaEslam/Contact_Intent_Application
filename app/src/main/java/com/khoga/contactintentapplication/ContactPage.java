package com.khoga.contactintentapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ContactPage extends Activity implements View.OnClickListener {

    TextView contactName;
    TextView contactPhone;
    TextView contactEmail;
    TextView contactWebsite;
    ContactObject contactObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_page);

        contactName = (TextView)findViewById(R.id.contactName);
        contactEmail = (TextView)findViewById(R.id.contactEmail);
        contactPhone = (TextView)findViewById(R.id.contactPhone);
        contactWebsite = (TextView)findViewById(R.id.contactWebsite);

        Bundle extras = getIntent().getExtras();
        if(extras == null) return;

        contactObject = (ContactObject) getIntent().getSerializableExtra("object");

        contactName.setText(contactObject.getName());
        contactEmail.setText(contactObject.getEmail());
        contactPhone.setText(contactObject.getPhone());
        contactWebsite.setText(contactObject.getWebsite());

        contactEmail.setOnClickListener(this);
        contactPhone.setOnClickListener(this);
        contactWebsite.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final int PHONE = 0;
        final int EMAIL = 1;
        final int WEBSITE = 2;
        switch(v.getId()){
            case R.id.contactPhone:
                Intent i = new Intent();
                i.putExtra("value", contactObject.getPhone());
                setResult(PHONE, i);
                finish();
                break;

            case R.id.contactEmail:
                i = new Intent();
                i.putExtra("value", contactObject.getEmail());
                setResult(EMAIL, i);
                finish();
                break;

            case R.id.contactWebsite:
                i = new Intent();
                i.putExtra("value", contactObject.getWebsite());
                setResult(WEBSITE, i);
                finish();
                break;
        }

    }
}
