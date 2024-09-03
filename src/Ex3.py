import json

class FileReader:

    def __init__(self, file_name: str):
        self.file_name = file_name

    def open_file(self) -> dict:
        with open('dados.json', 'r') as file:
            self.data = json.load(file)

        return self.data

    def get_max_day(self) -> dict:
        max_day = max(self.data, key=lambda x: x['valor'])
        return max_day

    def get_min_day(self) -> dict:
        new_data = list(filter(lambda x: x['valor'] != 0, self.data))
        min_day = min(new_data, key=lambda x: x['valor'])
        return min_day

    def get_days_above_average(self) -> list:
        total = sum([x['valor'] for x in self.data])
        average = total / len(self.data)
        days_above_average = list(filter(lambda x: x['valor'] > average, self.data))
        return days_above_average

if __name__ == '__main__':
    file = FileReader('dados.json')
    file.open_file()

    max_day = file.get_max_day()
    min_day = file.get_min_day()
    days_above_average = file.get_days_above_average()

    print('Dia com maior faturamento: %s' % max_day['dia'])
    print('Dia com menor faturamento: %s' % min_day['dia'])

    above_average = []
    for _ in days_above_average:
        above_average.append(_['dia'])

    print('Dias com faturamento acima da média: ')
    print(above_average)