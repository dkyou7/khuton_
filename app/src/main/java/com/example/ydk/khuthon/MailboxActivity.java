package com.example.ydk.khuthon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MailboxActivity extends AppCompatActivity {

    ListView messages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mailbox);

        messages = (ListView)findViewById(R.id.messages);

        ArrayList<MailboxMessage> adapter = new ArrayList<>();
        MailboxMessage userA = new MailboxMessage(R.drawable.ic_launcher_background, "A");
        MailboxMessage userB = new MailboxMessage(R.drawable.ic_launcher_background, "B");
        MailboxMessage userC = new MailboxMessage(R.drawable.ic_launcher_background, "C");

        adapter.add(userA);
        adapter.add(userB);
        adapter.add(userC);

        MailboxAdapter mailboxAdapter = new MailboxAdapter(getApplication(),adapter);
        messages.setAdapter(mailboxAdapter);
    }
}
