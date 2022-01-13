package com.example.labfirspospvo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.example.labfirspospvo.databinding.ActivityTwoBinding;
import com.example.labfirspospvo.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment implements View.OnClickListener{

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.button1:
            case R.id.imageView1:
                intent = new Intent(getActivity().getBaseContext(),
                        MainActivity.class);
                intent.putExtra("fileName", "anime");
                startActivity(intent);
                break;
            case R.id.button2:
            case R.id.imageView2:
                intent = new Intent(getActivity().getBaseContext(),
                        MainActivity.class);
                intent.putExtra("fileName", "cat");
                startActivity(intent);
                break;
            case R.id.button3:
            case R.id.imageView3:
                intent = new Intent(getActivity().getBaseContext(),
                        MainActivity.class);
                intent.putExtra("fileName", "china");
                startActivity(intent);
                break;
            case R.id.button4:
            case R.id.imageView4:
                intent = new Intent(getActivity().getBaseContext(),
                        MainActivity.class);
                intent.putExtra("fileName", "diehard");
                startActivity(intent);
                break;
            case R.id.button5:
            case R.id.imageView5:
                intent = new Intent(getActivity().getBaseContext(),
                        MainActivity.class);
                intent.putExtra("fileName", "lenin");
                startActivity(intent);
                break;
            default:
                break;
        }
    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}