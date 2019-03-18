# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Embeds the TCLAP library inside the ecl. This is a very convenient      command line parser in templatised c++."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " ecl-build ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/crystal/ecl_command_line/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0daaec7a9c4ef85af51c32e0db37001a"
SRC_URI[sha256sum] = "b45934bc518ec3fb2db5679cc94ee22198ff0caa7bbb7302ee06f6faef9fa432"
S = "${WORKDIR}/ecl_core-release-release-crystal-ecl_command_line-1.0.1-0"

inherit ament
