# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "qt_dotgraph provides helpers to work with dot graphs."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " python3-pydot python-qt-binding"
SRC_URI = "https://github.com/ros2-gbp/qt_gui_core-release/archive/release/crystal/qt_dotgraph/1.0.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "29ef3b681a044f20ef35df50f9d28762"
SRC_URI[sha256sum] = "b6b2ce385ac3ec80556af694fd4d539836eeda8393c115fd9836768334c2c6bf"
S = "${WORKDIR}/qt_gui_core-release-release-crystal-qt_dotgraph-1.0.4-0"

inherit ament
