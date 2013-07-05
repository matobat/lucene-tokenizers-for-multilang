/*
 * Copyright 2013 atWare, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jp.co.atware.solr.analizers.cjk.attributes;

import org.apache.lucene.analysis.CharFilter;
import org.apache.lucene.util.Attribute;

/**
 * トークンの開始・終了位置を保持するクラスです.
 * {@link CharFilter}による処理後の文字列に対する Offsetを保持します.
 */
public interface PosticheOffsetAttribute extends Attribute {

    /**
     * Returns this Token's starting offset, the position of the first character
     * corresponding to this token in the source text.
     * @see #setOffset(int, int)
     */
    public int startOffset();

    /**
     * Set the starting and ending offset.
     * @throws IllegalArgumentException If <code>startOffset</code> or
     *             <code>endOffset</code> are negative, or if
     *             <code>startOffset</code> is greater than
     *             <code>endOffset</code>
     * @see #startOffset()
     * @see #endOffset()
     */
    public void setOffset(int startOffset, int endOffset);

    /**
     * Returns this Token's ending offset, one greater than the position of the
     * last character corresponding to this token in the source text. The length
     * of the token in the source text is (<code>endOffset()</code> -
     * {@link #startOffset()}).
     * @see #setOffset(int, int)
     */
    public int endOffset();
}