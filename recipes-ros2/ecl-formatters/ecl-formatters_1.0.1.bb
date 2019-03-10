# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The formatters here simply format various input types to a specified    text format. They can be used with most streaming types (including both    ecl and stl streams)."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-ros ecl-build ecl-config ecl-converters ecl-exceptions ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/crystal/ecl_formatters/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8fe6e0015f54259e749857a617ff0223"
SRC_URI[sha256sum] = "b965714bbb869bbbfe9ecf925fa6e2f6e1275d8ff764f9e8f93110a00609cbe0"
S = "${WORKDIR}/ecl_core-release-release-crystal-ecl_formatters-1.0.1-0"

inherit catkin
