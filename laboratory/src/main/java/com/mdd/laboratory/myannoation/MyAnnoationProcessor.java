package com.mdd.laboratory.myannoation;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.util.Set;

@SupportedAnnotationTypes({"com.mdd.laboratory.myannoation.MyAnnoation"})
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class MyAnnoationProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        System.out.println("Hello World");
        annotations.forEach(typeElement -> {
            Set<? extends Element> elements = roundEnv.getElementsAnnotatedWith(typeElement);
            elements.forEach(element -> {
                System.out.print(element.getEnclosingElement());
                System.out.print(".");
                System.out.println(element.getSimpleName());
            });
        });

        return true;
    }
}
