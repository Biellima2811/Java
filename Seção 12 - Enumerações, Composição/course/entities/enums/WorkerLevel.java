package entities.enums;

public enum WorkerLevel {
	JUNIOR, MID_LEVEL, SENIOR;

	/**
	 * Este é um método estático auxiliar que criamos para converter um número
	 * (vindo do usuário) no valor Enum correspondente. Ex: se o usuário digita '1',
	 * este método retorna WorkerLevel.JUNIOR. * @param index O número digitado pelo
	 * usuário (1 para JUNIOR, 2 para MID_LEVEL, etc.)
	 * 
	 * @return O valor do enum correspondente.
	 */
	public static WorkerLevel fromInt(int index) {
		// Verifica se o índice está dentro do intervalo válido (1, 2 ou 3)
		if (index >= 1 && index <= values().length) {
			// values() é um método que retorna um array com todos os valores do enum:
			// [JUNIOR, MID_LEVEL, SENIOR]
			// Como arrays começam em 0, subtraímos 1 do índice do usuário.
			return values()[index - 1]; // ex: index 1 -> values()[0] -> JUNIOR
		} else {
			// Se o índice for inválido (ex: 4), lança uma exceção para indicar o erro.
			throw new IllegalArgumentException("Invalid index for WorkerLevel enum: " + index);
		}
	}
}
