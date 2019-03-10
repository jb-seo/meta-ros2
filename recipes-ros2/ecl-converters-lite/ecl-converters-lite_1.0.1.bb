# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "These are a very simple version of some of the functions in ecl_converters      suitable for firmware development. That is, there is no use of new,      templates or exceptions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-ros ecl-config ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/crystal/ecl_converters_lite/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "efaced7ba10f1edb793147c445336ec0"
SRC_URI[sha256sum] = "92cca05995fd5fa738bfbeb5ad9f49d5a77dedaef8c11ed7d59966bc0f8ce642"
S = "${WORKDIR}/ecl_lite-release-release-crystal-ecl_converters_lite-1.0.1-0"

inherit catkin
