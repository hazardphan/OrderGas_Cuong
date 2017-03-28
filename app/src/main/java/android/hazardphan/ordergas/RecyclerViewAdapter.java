package android.hazardphan.ordergas;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CuongPhan on 3/29/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>{
    private List<Item_GasHome> ds =new ArrayList<>();
    Context context;

    public RecyclerViewAdapter(List<Item_GasHome> ds, Context context) {
        this.ds = ds;
        this.context = context;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_homefrm,null);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        Item_GasHome gas = ds.get(position);
        holder.txtTenCuaHang.setText(gas.getTencuahang());
        holder.txtDiaChi.setText(gas.getDiadiem());
        holder.txtGiaTien.setText(gas.getMotagia());
        holder.txtSDT.setText(gas.getSodienthoai());

    }

    @Override
    public int getItemCount() {
        return ds.size();
    }

    //class Viewholer
    class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView txtTenCuaHang ,txtDiaChi,txtGiaTien,txtSDT;
        ImageView imgCuaHang;
        public RecyclerViewHolder(View v) {
            super(v);
            txtTenCuaHang= (TextView) v.findViewById(R.id.txtTenCuaHangHome);
            txtDiaChi= (TextView) v.findViewById(R.id.txtDiaChiHome);
            txtGiaTien= (TextView) v.findViewById(R.id.txtGiaTienHome);
            txtSDT= (TextView) v.findViewById(R.id.txtSDTHome);
            imgCuaHang= (ImageView) v.findViewById(R.id.imgHome);
        }
    }

}
