package nanosoft.azhar.me.demoproject_23january;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jmedeisis.draglinearlayout.DragLinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.review_dialog_base);
      //  setContentView(R.layout.bubble_layout);
     //   setContentView(R.layout.main_bubble_layout);
        setContentView(R.layout.drag_linear_layout);

        DragLinearLayout dragLinearLayout = (DragLinearLayout) findViewById(R.id.container);
        for(int i = 0; i < dragLinearLayout.getChildCount(); i++){
            View child = dragLinearLayout.getChildAt(i);
            // the child will act as its own drag handle
            dragLinearLayout.setViewDraggable(child, child);
        }
    }




}
