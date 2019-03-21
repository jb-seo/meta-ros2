# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This provides an Eigen implementation for ecl's linear algebra."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "eigen"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_eigen/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4092f059175fd6ef7f600cd8c9d5d71e"
SRC_URI[sha256sum] = "e238d140e36df2cc12c35123fbf798275570798811b7ea17e6c1ae6d2c960f3a"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_eigen-1.0.0-0"

inherit ros
inherit ament


