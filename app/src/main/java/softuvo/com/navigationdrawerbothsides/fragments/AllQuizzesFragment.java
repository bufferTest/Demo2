package softuvo.com.navigationdrawerbothsides.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import softuvo.com.navigationdrawerbothsides.Adapter.AllQuizzesAdapter;
import softuvo.com.navigationdrawerbothsides.R;


public class AllQuizzesFragment extends Fragment {
    View view;
    RecyclerView rvAllQuizzes;
    ArrayList<Integer> quizzesList;
    AllQuizzesAdapter allQuizzesAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_all_quizzes, container, false);
        findIds();
        setInitialData();

        return view;
    }

    private void setInitialData() {
        quizzesList = new ArrayList<>();
        quizzesList.add(R.drawable.photo1);
        quizzesList.add(R.drawable.photo1);
        quizzesList.add(R.drawable.photo1);
        quizzesList.add(R.drawable.photo1);


        allQuizzesAdapter = new AllQuizzesAdapter(getActivity(), quizzesList);
        rvAllQuizzes.setHasFixedSize(true);
        LinearLayoutManager gridLayoutManager =   new LinearLayoutManager(getActivity());
        rvAllQuizzes.setLayoutManager(gridLayoutManager);
        rvAllQuizzes.setAdapter(allQuizzesAdapter);

    }

    private void findIds() {
        rvAllQuizzes = view.findViewById(R.id.rv_all_quizzes);

    }
}
