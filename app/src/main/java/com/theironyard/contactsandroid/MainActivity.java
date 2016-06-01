package com.theironyard.contactsandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemLongClickListener {

    ArrayAdapter<Contact> contacts;

    ListView listView;
    EditText name;
    EditText phone;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        name = (EditText) findViewById(R.id.name);
        phone = (EditText) findViewById(R.id.phone);
        addButton = (Button) findViewById(R.id.button);

        contacts = new ArrayAdapter<Contact>(this, android.R.layout.simple_list_item_1);
        listView.setAdapter(contacts);

        addButton.setOnClickListener(this);
        listView.setOnItemLongClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Contact newContact = new Contact (name.getText().toString(), phone.getText().toString());
        contacts.add(newContact);
        name.setText("");
        phone.setText("");
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        Contact contact = contacts.getItem(position);
        contacts.remove(contact);
        return false;
    }
}
