# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provide CMake module with extra functionality for Python."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake"
SRC_URI = "https://github.com/ros2-gbp/rosidl_python-release/archive/release/crystal/python_cmake_module/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4d8a315589d0bbf60f4c793df071db3b"
SRC_URI[sha256sum] = "36726f1b3f8c018b567da8647d6140a43224fa7cb3fc2ea69b0e484c7cb546e1"
S = "${WORKDIR}/rosidl_python-release-release-crystal-python_cmake_module-0.6.2-0"

inherit catkin
