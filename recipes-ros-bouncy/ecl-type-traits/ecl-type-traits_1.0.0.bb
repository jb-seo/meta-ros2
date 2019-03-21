# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Extends c++ type traits and implements a few more to boot."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-config ecl-license ecl-mpl"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_type_traits/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "79a5522b972f630abd10fae6fe45a975"
SRC_URI[sha256sum] = "5e178a9728e519098c0dee6becfb66bc9aec478e47083126e55436a5a8e8d375"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_type_traits-1.0.0-0"

inherit ros
inherit ament


