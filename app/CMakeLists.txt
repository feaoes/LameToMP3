cmake_minimum_required(VERSION 3.4.1)

add_library( # Sets the name of the library.
             mp3lame

             # Sets the library as a shared library.
             SHARED

             # Provides a relative path to your source file(s).
             src/main/cpp/one/com_swmofang_lametomp3_MP3Recorder.c
             src/main/cpp/one/libmp3lame/bitstream.c
             src/main/cpp/one/libmp3lame/fft.c
             src/main/cpp/one/libmp3lame/id3tag.c
             src/main/cpp/one/libmp3lame/mpglib_interface.c
             src/main/cpp/one/libmp3lame/presets.c
             src/main/cpp/one/libmp3lame/quantize.c
             src/main/cpp/one/libmp3lame/reservoir.c
             src/main/cpp/one/libmp3lame/tables.c
             src/main/cpp/one/libmp3lame/util.c
             src/main/cpp/one/libmp3lame/VbrTag.c
             src/main/cpp/one/libmp3lame/encoder.c
             src/main/cpp/one/libmp3lame/gain_analysis.c
             src/main/cpp/one/libmp3lame/lame.c
             src/main/cpp/one/libmp3lame/newmdct.c
             src/main/cpp/one/libmp3lame/psymodel.c
             src/main/cpp/one/libmp3lame/quantize_pvt.c
             src/main/cpp/one/libmp3lame/set_get.c
             src/main/cpp/one/libmp3lame/takehiro.c
             src/main/cpp/one/libmp3lame/vbrquantize.c
             src/main/cpp/one/libmp3lame/version.c
             )

include_directories(src/main/cpp/one/
                    src/main/cpp/one/libmp3lame/)

find_library( # Sets the name of the path variable.
              log-lib

              # Specifies the name of the NDK library that
              # you want CMake to locate.
              log )


target_link_libraries( # Specifies the target library.
                       mp3lame

                       # Links the target library to the log library
                       # included in the NDK.
                       ${log-lib} )