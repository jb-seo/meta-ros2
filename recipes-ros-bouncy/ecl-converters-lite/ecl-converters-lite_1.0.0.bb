# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "These are a very simple version of some of the functions in ecl_converters      suitable for firmware development. That is, there is no use of new,      templates or exceptions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-config ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/bouncy/ecl_converters_lite/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b3c92afdde354cc1bcef4ef5ab473e75"
SRC_URI[sha256sum] = "65b002d132276ac82a11ed3f3b247af573bffdb5d4a65367f460c68455c5b592"
S = "${WORKDIR}/ecl_lite-release-release-bouncy-ecl_converters_lite-1.0.0-0"

inherit ros
inherit ament


