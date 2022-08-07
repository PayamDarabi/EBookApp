package payam.ebookapp.adapters;

/**
 * Created by payam on 4/18/2017.
 */

import android.content.Context;

import io.realm.RealmResults;
import payam.ebookapp.model.Book;

public class RealmBooksAdapter extends RealmModelAdapter<Book> {

    public RealmBooksAdapter(Context context, RealmResults<Book> realmResults, boolean automaticUpdate) {

        super(context, realmResults, automaticUpdate);
    }
}