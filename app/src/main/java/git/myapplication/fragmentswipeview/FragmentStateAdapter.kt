package git.myapplication.fragmentswipeview

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewpagerFragmentAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {


    val fragmentList = listOf<Fragment>(Fragment01(), Fragment02(), Fragment03())

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        Log.d("position",""+position)
        return fragmentList[position]
    }
}

