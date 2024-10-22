import sys
from googletrans import Translator

# Criar uma instância do tradutor
translator = Translator()

print("Digite o texto que você deseja traduzir (digite uma linha vazia para finalizar):")

# Captura de múltiplas linhas até uma linha vazia
text = []
while True:
    line = input()
    if line:
        text.append(line)
    else:
        break

# Juntar todas as linhas em um único bloco de texto
text = "\n".join(text)

# Escolher o idioma de destino
target_language = input("Digite o código do idioma de destino (ex: 'en' para inglês): ")

# Fazer a tradução
translation = translator.translate(text, dest=target_language)

# Exibir a tradução
print(f"Texto traduzido: {translation.text}")
