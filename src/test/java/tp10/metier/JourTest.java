/*
 * Copyright 2021 21911890.
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
package tp10.metier;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 21911890
 */
public class JourTest {
    
    public JourTest() {
    }

    @Test
    public void testBuildJourGetNoJour (){
    final int noJour = 1;
    final  Jour j = new Jour(noJour);
    final  int noJourRes = j.getNoJour();
        assertSame(noJour, noJourRes,"the noJour used to build jour should be the same as the result of getNoJour");
    }
    @Test
    public  void testmethodeToString(){
        final int noJour = 1;
        final String stringJour = "Jour " + noJour;
        final  Jour j = new Jour(noJour);
        final String stringJourRes = j.toString();
        assertEquals(stringJour, stringJourRes,"same string jour ");
        
    }
    
}
