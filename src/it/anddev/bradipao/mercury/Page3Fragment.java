package it.anddev.bradipao.mercury;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Page3Fragment extends Fragment {

   Button btnWrite;
   public String ptext="..PAGE 3..";
   
   public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
      
      // fragment not when container null
      if (container == null) {
         return null;
      }
      // inflate view from layout
      View view = (LinearLayout)inflater.inflate(R.layout.page3,container,false);
      // update text
      TextView tv = (TextView) view.findViewById(R.id.tvText3);
      tv.setText(ptext);
      
      return view;
   }
   
   // set text helper function
   public void setText(String item) {
      TextView view = (TextView) getView().findViewById(R.id.tvText3);
      view.setText(item);
   } 
   
}