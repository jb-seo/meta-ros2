# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Embeds the TCLAP library inside the ecl. This is a very convenient      command line parser in templatised c++."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_command_line/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1cf7c3687c9415b26c1b164d5daed857"
SRC_URI[sha256sum] = "c223298c8cafc26b2bdb5b7c2dcd34c9095fec66f3e16decdcaa2f2182d64f41"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_command_line-1.0.0-0"

inherit ros
inherit ament


