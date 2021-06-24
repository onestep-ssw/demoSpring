package com.spring.demo.config;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.stereotype.Component;

/**
 * @author ssw
 * @description
 * @date 2021/6/8
 */

@Component
public class EnumConvertFactory implements ConverterFactory<String, BaseEnum> {
    @Override
    public <T extends BaseEnum> Converter<String, T> getConverter(Class<T> aClass) {
       return new StringToIEum(aClass);
    }


    private static class StringToIEum<T extends BaseEnum> implements Converter<String, T>{
        private Class<T> targerType;
        public StringToIEum(Class<T> targerType) {
            this.targerType = targerType;
        }
        @Override
        public T convert(String s) {
            if (StringUtils.isBlank(s)){
                return null;
            }
            return (T) EnumConvertFactory.getEnum(this.targerType,s);
        }
    }

    public static <T extends BaseEnum> Object getEnum(Class<T> targerType, String source) {
        for (T enumObj : targerType.getEnumConstants()) {
            if (source.equals(String.valueOf(enumObj.getCode()))) {
                return enumObj;
            }
        }
        return null;
    }
}
