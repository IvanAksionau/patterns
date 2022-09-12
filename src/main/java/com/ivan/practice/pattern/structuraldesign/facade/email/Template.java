package com.ivan.practice.pattern.structuraldesign.facade.email;

public abstract class Template {

    public abstract String format(Object obj);

	public enum TemplateType {Email, NewsLetter}
}
