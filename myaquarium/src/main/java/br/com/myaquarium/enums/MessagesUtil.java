package br.com.myaquarium.enums;

public enum MessagesUtil {

	AQUARIUM_LIST_IS_EMPTY("Usu�rio n�o tem aqu�rios cadastrados");

	private String data;

	MessagesUtil(String msg) {
		this.data = msg;
	}

	public String getValue() {
		return data;
	}
}
