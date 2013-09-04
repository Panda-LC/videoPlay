package com.hck.player.adpter;

import java.util.List;

import com.hck.myplayer.R;
import com.hck.player.ui.ShowTypeActivity;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class AllAdpter extends BaseExpandableListAdapter {
	public List<String> father;
	public List<List<String>> chilerd;
	private Context context;

	public AllAdpter(List<String> faList, List<List<String>> chList,
			Context context) {
		this.father = faList;
		this.chilerd = chList;
		this.context = context;
	}

	@Override
	public Object getChild(int groupPosition, int childPosition) {
		return chilerd.get(groupPosition).get(childPosition);
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		return childPosition;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition,
			boolean isLastChild, View convertView, ViewGroup parent) {
		View view = null;
		view = LayoutInflater.from(context).inflate(
				R.layout.all_expand_list_item, null);
		TextView textView = (TextView) view
				.findViewById(R.id.all_list_text_item_id);
		textView.setText(chilerd.get(groupPosition).get(childPosition));
		return view;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		return chilerd.get(groupPosition).size();
	}

	@Override
	public Object getGroup(int groupPosition) {
		return father.get(groupPosition);
	}

	@Override
	public int getGroupCount() {
		return father.size();
	}

	@Override
	public long getGroupId(int groupPosition) {
		return groupPosition;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded,
			View convertView, ViewGroup parent) {
		View view = LayoutInflater.from(context).inflate(
				R.layout.all_expand_list, null);
		TextView textView = (TextView) view.findViewById(R.id.all_list_text_id);
		textView.setText(father.get(groupPosition));
		return view;
	}

	@Override
	public boolean hasStableIds() {
		return true;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		Intent intent = new Intent();
		intent.setClass(context, ShowTypeActivity.class);
		switch (groupPosition) {
		case 0: {
			switch (childPosition) {
			case 0:
				intent.putExtra("id", 129 + "");
				intent.putExtra("name", "�����");
				break;
			case 1:
				intent.putExtra("id", 130 + "");
				intent.putExtra("name", "��Ц����");
				break;
			case 2:
				intent.putExtra("id", 131 + "");
				intent.putExtra("name", "ԭ����Ц");
				break;
			case 3:
				intent.putExtra("id", 132 + "");
				intent.putExtra("name", "��Ц����");
				break;
			case 4:
				intent.putExtra("id", 133 + "");
				intent.putExtra("name", "���ˇ���");
				break;
			case 5:
				intent.putExtra("id", 134 + "");
				intent.putExtra("name", "����ع�");
				break;
			default:
				break;
			}
			break;
		}

		case 1: {
			switch (childPosition) {
			case 0:
				intent.putExtra("id", 77 + "");
				intent.putExtra("name", "ԭ��Ӱ��");
				break;
			case 1:
				intent.putExtra("id", 76 + "");
				intent.putExtra("name", "���ֶ���");
				break;
			case 2:
				intent.putExtra("id", 78 + "");
				intent.putExtra("name", "���Ǹ�Ц");
				break;
			case 3:
				intent.putExtra("id", 79 + "");
				intent.putExtra("name", "У԰��Ʒ");
				break;
			case 4:
				intent.putExtra("id", 80 + "");
				intent.putExtra("name", "�������");
				break;
			case 5:
				intent.putExtra("id", 81 + "");
				intent.putExtra("name", "�Ŀ�");
				break;
			default:
				break;
			}
			break;
		}

		case 2: {
			switch (childPosition) {
			case 0:
				intent.putExtra("id", 9 + "");
				intent.putExtra("name", "���ǰ���");
				break;
			case 1:
				intent.putExtra("id", 18 + "");
				intent.putExtra("name", "Ӱ����Ѷ");
				break;
			}
			break;

		}

		case 3: {
			switch (childPosition) {
			case 0:
				intent.putExtra("id", 68 + "");
				intent.putExtra("name", "���");
				break;
			case 1:
				intent.putExtra("id", 66 + "");
				intent.putExtra("name", "����");
				break;
			case 2:
				intent.putExtra("id", 67 + "");
				intent.putExtra("name", "����");
				break;
			case 3:
				intent.putExtra("id", 72 + "");
				intent.putExtra("name", "�Ƹ�");
				break;
			case 4:
				intent.putExtra("id", 73 + "");
				intent.putExtra("name", "�Ƽ�");
				break;
			}
			break;

		}
		
	
		case 4: {
			switch (childPosition) {
			case 0:
				intent.putExtra("id", 8 + "");
				intent.putExtra("name", "��Ů��ģ");
				break;
			case 1:
				intent.putExtra("id", 98 + "");
				intent.putExtra("name", "���ⱨ��");
				break;
			case 2:
				intent.putExtra("id", 7 + "");
				intent.putExtra("name", "�������");
				break;
			case 3:
				intent.putExtra("id", 6 + "");
				intent.putExtra("name", "��װ����");
				break;
			case 4:
				intent.putExtra("id", 43 + "");
				intent.putExtra("name", "�����Ƽ�");
				break;
			case 5:
				intent.putExtra("id", 5 + "");
				intent.putExtra("name", "�³��ٵ�");
				break;
			}
			break;
		}

		case 5: {
			switch (childPosition) {
			case 0:
				intent.putExtra("id", 36 + "");
				intent.putExtra("name", "�������");
				break;
			case 1:
				intent.putExtra("id", 37 + "");
				intent.putExtra("name", "��������");
				break;
			case 2:
				intent.putExtra("id", 41 + "");
				intent.putExtra("name", "�ۺ�����");
				break;
			case 3:
				intent.putExtra("id", 38 + "");
				intent.putExtra("name", "�����˶�");
				break;
			case 4:
				intent.putExtra("id", 50 + "");
				intent.putExtra("name", "����ˤ��");
				break;
			case 5:
				intent.putExtra("id", 48 + "");
				intent.putExtra("name", "��Ů����");
				break;
			}
			break;
		}

		case 6: {
			switch (childPosition) {
			case 0:
				intent.putExtra("id", 60 + "");
				intent.putExtra("name", "������Ϸ");
				break;
			case 1:
				intent.putExtra("id", 61 + "");
				intent.putExtra("name", "���Ӿ���");
				break;
			case 2:
				intent.putExtra("id", 62 + "");
				intent.putExtra("name", "��������");
				break;
			case 3:
				intent.putExtra("id", 63 + "");
				intent.putExtra("name", "��Ϸ����");
				break;
			case 4:
				intent.putExtra("id", 64 + "");
				intent.putExtra("name", "����ս��");
				break;
			}
		}
		}
		context.startActivity(intent);
		return true;
	}

}
