package br.com.isaque.cm.modelo;

@FunctionalInterface
public interface CampoObservador {
	public void eventoOcorreu(Campo campo, CampoEvento evento);
}
