# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_py_common provides common functionality for rqt plugins written in Python.     Despite no plugin is provided, this package is part of the rqt_common_plugins     repository to keep refactoring generic functionality from these common plugins     into this package as easy as possible.      Functionality included in this package should cover generic ROS concepts and     should not introduce any special dependencies beside &quot;ros_base&quot;."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " python-qt-binding qt-gui qtbase5-dev rclpy rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/rqt-release/archive/release/crystal/rqt_py_common/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5f4cb9241c947ab95542f162ccabccbb"
SRC_URI[sha256sum] = "9aab24d68ce8ddf28c893ad4e015ee82092f937f456cbf904e8eba4bf7db4fcd"
S = "${WORKDIR}/rqt-release-release-crystal-rqt_py_common-1.0.2-0"

inherit ament
