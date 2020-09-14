/*
 * Copyright 2017-present  Koordinierungsstelle für IT-Standards (KoSIT)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.kosit.validationtool.api;

/**
 * Fehlerobjekt für die Bereitstellung von Fehlern aus der internen Verarbeitung, bspw. Schema-Validation-Fehler.
 * 
 * @author Andreas Penski
 */
public interface XmlError {

    /**
     * Gibt die Fehlermeldung zurück.
     * 
     * @return die Fehlermeldung
     */
    String getMessage();

    /**
     * Zeigt den Schweregrad der Fehlermeldung an
     * 
     * @return der Schweregrad
     * @see Severity
     */
    Severity getSeverity();

    /**
     * Gibt optional eine Zeilennummer an, aus der der Fehler resultiert.
     * 
     * @return die Zeitelnnummer
     */
    Integer getRowNumber();

    /**
     * Gibt optional eine Spaltennummer an, aus der der Fehler resultiert.
     * 
     * @return die Spaltennummer
     */
    Integer getColumnNumber();

    enum Severity {
        SEVERITY_WARNING, SEVERITY_ERROR, SEVERITY_FATAL_ERROR;
    }

}
