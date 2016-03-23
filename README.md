Android TV 输入法.

欢迎加入android TV开发群，一起进步，一起学习.

![输入图片说明](http://git.oschina.net/uploads/images/2016/0321/214557_bc6d2d45_111902.png "在这里输入图片标题")

加班加点，支持点噢！~！

![输入图片说明](http://git.oschina.net/uploads/images/2016/0321/214630_cf91c358_111902.png "在这里输入图片标题")


运行效果图


![输入图片说明](http://git.oschina.net/uploads/images/2016/0321/214146_c65a16eb_111902.png "在这里输入图片标题")

![输入图片说明](http://git.oschina.net/uploads/images/2016/0321/214153_38260cde_111902.png "在这里输入图片标题")

![输入图片说明](http://git.oschina.net/uploads/images/2016/0321/214200_079fd75c_111902.png "在这里输入图片标题")

【大小写状态按键】

```
<string name="toggle_keycode_case">-1</string> <!-- 大小写切换 -->
<string name="toggle_en_lower">2</string> <!-- 小写 -->
<string name="toggle_en_upper">3</string> <!-- 大写 -->
    
<toggle_key 
    key_code="@string/toggle_keycode_case" >
    <state
        key_icon="@drawable/daxie"
        key_label="大写"
        state_id="@string/toggle_en_upper" />
    <state
        key_icon="@drawable/xiaoxie"
        key_label="小写"
        state_id="@string/toggle_en_lower" />
</toggle_key>
```

【切换到数字键盘】

```
<string name="mode_skb_all_number">-3</string> <!-- 数字键盘 -->
<string name="mode_skb_all_en">-4</string> <!-- 英文键盘 -->
<string name="mode_skb_all_sym">-5</string> <!-- 符号键盘(暂时不支持，已和数字键盘合并) -->
    
<key
    key_code="@string/mode_skb_all_number"
    key_label="123_!"
    key_text_size="@dimen/px30" />
```
    
【回车按键】

```
<string name="keycode_center">66</string> <!-- 回车 -->

<string name="toggle_enter_go">7</string> <!-- 回车状态 -->
<string name="toggle_enter_search">8</string>
<string name="toggle_enter_send">9</string>
<string name="toggle_enter_next">10</string>
<string name="toggle_enter_done">11</string>
<string name="toggle_enter_multi_line_done">12</string>
    
<toggle_key
    key_code="@string/keycode_center"
    key_height="@dimen/px210"
    key_text_size="@dimen/px30" >
    <state
        key_label="@string/enter_go"
        state_id="@string/toggle_enter_go" />
    <state
        key_icon="@drawable/g_search_icon"
        state_id="@string/toggle_enter_search" />
    <state
        key_label="@string/enter_send"
        state_id="@string/toggle_enter_send" />
    <state
        key_label="@string/enter_next"
        key_text_size="@dimen/px28"
        state_id="@string/toggle_enter_next" />
    <state
        key_label="@string/enter_text"
        state_id="@string/toggle_enter_done" />
    <state
        key_label="@string/enter_mulit_line_text"
        state_id="@string/toggle_enter_multi_line_done" />
</toggle_key> 
```   

【空格按键】

```
<string name="keycode_space">62</string> <!-- 空格 -->

<key
    key_code="@string/keycode_space"
    key_icon="@drawable/kongge"
    key_width="@dimen/px210" />
```
    
【光标移动】

```
<string name="keycode_left">21</string> <!-- 左边移动 -->
<string name="keycode_right">22</string> <!-- 右边移动 -->
    
<key
    key_code="@string/keycode_left"
    key_label="&lt;"/>
<key
    key_code="@string/keycode_right"
    key_label="&gt;"/>
```
    
【删除按键】

```
<string name="keycode_del">67</string> <!-- 删除 -->

<key
    key_code="@string/keycode_del"
    key_icon="@drawable/delete" />
```

【返回-退出输入法】

```
<string name="keycode_back">4</string> <!-- 返回 -->

<key
    key_code="@string/keycode_back"
    key_icon="@drawable/quit_skb" />
```
    
【翻页按键】

```
<string name="toggle_keycode_page">-100</string> <!-- 翻页 -->
<string name="toggle_keycode_page_1">101</string> <!-- 翻页1 -->
<string name="toggle_keycode_page_2">102</string> <!-- 翻页2 -->
    
<toggle_key
    key_code="@string/toggle_keycode_page"
    key_label="翻页"
    key_text_size="@dimen/px30" />

会根据翻页切换的状态改变字符，比如:

<toggle_key
    key_label=".com"
    key_text_size="@dimen/px30" >
    <state
        key_label=".com"
        key_text_size="@dimen/px30"
        state_id="@string/toggle_keycode_page_1" />
    <state
        key_label="+"
        state_id="@string/toggle_keycode_page_2" />
</toggle_key>
```


【后续加入】

模板支持.

T9键盘支持.

中文词库.
