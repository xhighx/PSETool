package com.xhighx.psetool.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xhighx.psetool.R;
import com.xhighx.psetool.content.CementSidingProjectHelper;
import com.xhighx.psetool.content.ChainlinkFenceProjectHelper;
import com.xhighx.psetool.content.CompositeFenceProjectHelper;
import com.xhighx.psetool.content.DeckProjectHelper;
import com.xhighx.psetool.content.DoorProjectHelper;
import com.xhighx.psetool.content.GutterProjectHelper;
import com.xhighx.psetool.content.InsulationProjectHelper;
import com.xhighx.psetool.content.MetalFenceProjectHelper;
import com.xhighx.psetool.content.RoofProjectHelper;
import com.xhighx.psetool.content.VinylFenceProjectHelper;
import com.xhighx.psetool.content.VinylSidingProjectHelper;
import com.xhighx.psetool.content.WindowProjectHelper;
import com.xhighx.psetool.content.WoodFenceProjectHelper;
import com.xhighx.psetool.model.Assortment;
import com.xhighx.psetool.model.Cart;
import com.xhighx.psetool.model.Item;
import com.xhighx.psetool.model.ItemAssortment;
import com.xhighx.psetool.model.ProjectAssortmentProvider;

import java.text.NumberFormat;
import java.util.List;

/**
 * Created by James on 2/11/14.
 */
public class PseWorksheetDialogFragment extends DialogFragment {
    private static String _category= "category";
    private ProjectAssortmentProvider mProjectAssortmentProvider;
    private List<ItemAssortment> mCategoryAssortments;

    public ProjectAssortmentProvider getCategoryProvider(int res){
        switch (res){
            case R.string.ARG_CATEGORY_CEMENT_SIDING:
                mProjectAssortmentProvider = new CementSidingProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_CHAINLINK_FENCE:
                mProjectAssortmentProvider = new ChainlinkFenceProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_COMPOSITE_FENCE:
                mProjectAssortmentProvider = new CompositeFenceProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_DOOR:
                mProjectAssortmentProvider = new DoorProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_GUTTER:
                mProjectAssortmentProvider = new GutterProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_METAL_FENCE:
                mProjectAssortmentProvider = new MetalFenceProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_VINYL_FENCE:
                mProjectAssortmentProvider = new VinylFenceProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_VINYL_SIDING:
                mProjectAssortmentProvider = new VinylSidingProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_WINDOW:
                mProjectAssortmentProvider = new WindowProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_SHINGLE_ROOF:
                mProjectAssortmentProvider = new RoofProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_METAL_ROOF:
                mProjectAssortmentProvider = new RoofProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_WOOD_FENCE:
                mProjectAssortmentProvider = new WoodFenceProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_INSULATION:
                mProjectAssortmentProvider = new InsulationProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_DECKING:
                mProjectAssortmentProvider = new DeckProjectHelper();
                return mProjectAssortmentProvider;
        }
        return null;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);
    }

    public static PseWorksheetDialogFragment newInstance(int res){
        PseWorksheetDialogFragment frag = new PseWorksheetDialogFragment();
        Bundle b = new Bundle();
        b.putInt(_category, res);
        frag.setArguments(b);
        return frag;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mProjectAssortmentProvider = getCategoryProvider(getArguments().getInt(_category));

    }

    public class PseWorksheetAdapter extends BaseAdapter {

        private Context context;
        private Assortment assortment;


        public PseWorksheetAdapter(Context context) {
            super();
            this.context = context;

        }

        @Override
        public int getCount() {
            return assortment.size();
        }

        @Override
        public Item getItem(int position) {
            return assortment.get(position);
        }

        @Override
        public long getItemId(int position) {
            return assortment.get(position).hashCode();
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            final ViewItem item;
            NumberFormat currencyformatter = NumberFormat.getCurrencyInstance();
            NumberFormat percentformat = NumberFormat.getPercentInstance();
            if (convertView == null) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout._pseworksheet_item_view, null);
                item = new ViewItem();
                item.itemName = (TextView) convertView.findViewById(R.id.fragment_pseworksheet_descriptiontv);
                item.itemSku = (TextView) convertView.findViewById(R.id.fragment_pseworksheet_skutv);
                item.itemModel = (TextView) convertView.findViewById(R.id.fragment_pseworksheet_modeltv);
                item.itemCost = (TextView) convertView.findViewById(R.id.fragment_pseworksheet_costtv);
                item.itemPrice = (TextView) convertView.findViewById(R.id.fragment_pseworksheet_pricetv);
                item.itemMargin = (TextView) convertView.findViewById(R.id.fragment_pseworksheet_margintv);
                convertView.setTag(item);
            } else {
                item = (ViewItem) convertView.getTag();
            }

            Item curItem = (Item) getItem(position);
            item.itemName.setText(curItem.getName());
            if (curItem.getId() != null) {
                item.itemSku.setText("#" + curItem.getId());
            }
            if (curItem.getModel() != null) {
                item.itemModel.setText(curItem.getModel());
            }else{
                item.itemModel.setText("");
            }
            //if(curItem.getMargin() != 0){
            item.itemMargin.setText(percentformat.format(curItem.getMargin()));
            // }
            item.itemCost.setText(currencyformatter.format(curItem.getCost()));
            item.itemPrice.setText(currencyformatter.format(curItem.getPrice()));


            return convertView;
        }

        private class ViewItem {
            TextView itemName;
            TextView itemSku;
            TextView itemModel;
            TextView itemCost;
            TextView itemPrice;
            TextView itemMargin;
        }


    }
}
