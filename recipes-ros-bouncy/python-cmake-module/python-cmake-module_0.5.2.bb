# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provide CMake module with extra functionality for Python."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/rosidl_python-release/archive/release/bouncy/python_cmake_module/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a664dbe6986d5451df2dc3b77b7e378f"
SRC_URI[sha256sum] = "fe0d845dbdbe35c1ff08333ea09d2d1df085ae3dabce80e9da6144a0ab8b730d"
S = "${WORKDIR}/rosidl_python-release-release-bouncy-python_cmake_module-0.5.2-0"


inherit ros
inherit ament

