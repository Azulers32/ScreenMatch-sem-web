package br.com.alura.Screenmatch.Service;

public interface IConverteDados {
    <T> T obterDados (String json, Class<T> classe);
}
