package com.sewa.mobil;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sewa.mobil.domain.Pelanggan;
import java;
import utils;
import java.util.ArrayList;
import java.util.List;

public class ListPelangganAdapter extends BaseAdapter {

    private Context context;
    private List<Pelanggan> pelanggans = new ArrayList<>();
    private TextView lblNama, lblTelp;

    public ListPelangganAdapter(Context contextKiriman, List<Pelanggan> pelanggansKiriman) {
        this.context = contextKiriman;
        this.pelanggans = pelanggansKiriman;
    }

    @Override
    public int getCount() {
        return pelanggans.size();
    }

    @Override
    public Pelanggan getItem(int position) {
        return pelanggans.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView =
                    LayoutInflater
                    .from(context)
                    .inflate(R.layout.list_pelanggan, parent, false);

            lblNama = (TextView) convertView.findViewById(R.id.item_nama);
            lblTelp = (TextView) convertView.findViewById(R.id.item_telp);
        }

        Pelanggan p = getItem(position);
        lblNama.setText(p.getNama());
        lblTelp.setText(p.getTelp());

        return convertView;
    }
}
