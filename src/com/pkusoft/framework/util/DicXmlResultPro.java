package com.pkusoft.framework.util;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="data")
public class DicXmlResultPro {
	private List<DicXmlDtoPro> list;

	public List<DicXmlDtoPro> getList() {
		return this.list;
	}

	@XmlElement(name = "row")
	public void setList(List<DicXmlDtoPro> list) {
		this.list = list;
	}

	@XmlRootElement(name = "row")
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
	@XmlType(name = "", propOrder = { "aspell", "spell", "text", "code","perm" })
	public static class DicXmlDtoPro {
		@XmlAttribute(name = "DIC_CODE")
		private String code;

		@XmlAttribute(name = "DIC_TEXT")
		private String text;

		@XmlAttribute(name = "DIC_SPELL")
		private String spell;

		@XmlAttribute(name = "DIC_ASPELL")
		private String aspell;

		@XmlAttribute(name = "DIC_PERM")
		private String perm;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getText() {
			return this.text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public String getSpell() {
			return this.spell;
		}

		public void setSpell(String spell) {
			this.spell = spell;
		}

		public String getAspell() {
			return this.aspell;
		}

		public void setAspell(String aspell) {
			this.aspell = aspell;
		}

		public String getPerm() {
			return perm;
		}

		public void setPerm(String perm) {
			this.perm = perm;
		}
	}
}
