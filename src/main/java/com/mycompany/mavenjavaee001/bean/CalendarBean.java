/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenjavaee001.bean;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author 07930
 */
@Named
@ViewScoped
public class CalendarBean implements Serializable {
    
    @Getter @Setter
    private Date calendar;
    @Getter @Setter
    private String wareki;
    @Getter @Setter
    private String longValue;
    
    @Getter @Setter
    private long inputLongValue;
    @Getter @Setter
    private String seireki;
    @Getter @Setter
    private String wareki2;

    public void onOsePush() throws ParseException {
	Locale locale = new Locale("ja", "JP", "JP");
	Calendar cal = Calendar.getInstance(locale);
	cal.setTime(this.calendar);
//	cal.add(Calendar.HOUR, 23);
//	cal.add(Calendar.MINUTE, 59);
//	cal.add(Calendar.SECOND, 59);
	DateFormat japaseseFormat = new SimpleDateFormat("GGGGy年M月d日 HH時mm分ss秒", locale);
	this.wareki = japaseseFormat.format(cal.getTimeInMillis());
	
	/**
	 * Javaに和暦を設定する場合、jreのlibディレクトリ内にある、
	 * 「calendars.properties」ファイルを編集すればよいとのこと
	 * 例えば、2017年1月8日から「宇宙世紀」とする場合の設定は以下
	 * ※baneはUnicodeエンコード、sinceはLong値
	 * 
	 * calendar.japanese.eras: \
	 * name=Meiji,abbr=M,since=-3218832000000;  \
	 * name=Taisho,abbr=T,since=-1812153600000; \
	 * name=Showa,abbr=S,since=-1357603200000;  \
	 * name=Heisei,abbr=H,since=600220800000;   \
	 * name=\u5b87\u5b99\u4e16\u7d00,abbr=UC,since=1483801200000
	 */
	this.longValue = Long.toString(cal.getTimeInMillis());
    }
    
    public void onOse2Push() {
	DateFormat japaseseFormat = new SimpleDateFormat("GGGGy年M月d日", Locale.JAPANESE);
	this.seireki = japaseseFormat.format(inputLongValue);
	Locale locale = new Locale("ja", "JP", "JP");
	japaseseFormat = new SimpleDateFormat("GGGGy年M月d日", locale);
	this.wareki2 = japaseseFormat.format(inputLongValue);
    }
    
}
