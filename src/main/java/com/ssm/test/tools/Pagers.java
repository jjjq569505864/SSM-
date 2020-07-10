package com.ssm.test.tools;

import java.util.List;

import com.github.pagehelper.PageInfo;

/**
 * ��ҳ�±���ʾ��ʽ
 * @author Administrator
 *
 * @param <T>
 */
public class Pagers<T> extends PageInfo<T> {
	private int maxpage;
	private int minpage;
	private int showpcount=10;
	
	public int getMaxpage() {
		return maxpage;
	}

	public void setMaxpage(int maxpage) {
		this.maxpage = maxpage;
	}

	public int getMinpage() {
		return minpage;
	}

	public void setMinpage(int minpage) {
		this.minpage = minpage;
	}

	public int getShowpcount() {
		return showpcount;
	}

	public void setShowpcount(int showpcount) {
		this.showpcount = showpcount;
	}

	public Pagers(List<T> list) {
		super(list);
		// ��ȡ��ҳ��
		Integer pagecount = super.getPages();
		// �������(��С)��ʾҳ��
		Integer maxpage = 0;// ��ǰ��ʾ���ҳ��
		Integer minpage = 0;
		Integer index =super.getPageNum();// ��ǰ�ڼ�ҳ
		if (pagecount <= showpcount) {// ����ҳ��С�ڵ�����ʾ��ҳ��ʱ
			maxpage = pagecount;
			minpage = 1;
		} else {
			Integer buff = showpcount / 2; // ȡ�м�����maxpage=index+buff
			buff = index + buff;// ��ʾ�����ҳ�����ۣ�
			if (buff <= showpcount) {
				maxpage = showpcount;
				minpage = 1;
			} else if (buff < pagecount) {
				maxpage = buff;
				minpage = maxpage - showpcount + 1;

			} else if (buff >= pagecount) {
				maxpage = pagecount;
				minpage = maxpage - showpcount + 1;
			}
		}
		this.maxpage = maxpage;
		this.minpage = minpage;
	}
}
