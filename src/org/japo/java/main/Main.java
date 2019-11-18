/*
 * Copyright 2019 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        final int NUMERO_PETICIONES = 4;
        final int P_MIN = 1;
        final int P_MAX = 10;

        int nPlanta = 0;

        boolean bucleError = false;
        boolean testOk = false;

        for (int i = 0; i < NUMERO_PETICIONES; i++) {

            do {

                testOk = false;

                do {

                    try {
                        System.out.printf("Persona número %d. Introduce número de planta : ", i + 1);
                        nPlanta = SCN.nextInt();

                        bucleError = true;

                    } catch (Exception e) {

                        System.out.println("Error: Entrada incorrecta.");
                    } finally {

                        SCN.nextLine();
                    }

                } while (!bucleError);

                testOk = nPlanta >= P_MIN && nPlanta <= P_MAX;

            } while (!testOk);

            System.out.printf("Planta %02d disponible. Subiendo ... %n", nPlanta);

        }

    }
}
