# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the C++ interfaces for PrismTech OpenSplice."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " opensplice-cmake-module rmw rosidl-cmake rosidl-generator-c rosidl-generator-cpp rosidl-parser rosidl-typesupport-interface"
SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_opensplice-release/archive/release/crystal/rosidl_typesupport_opensplice_cpp/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ba7a7b2dfbf6cca54e161aa072557f23"
SRC_URI[sha256sum] = "bc8c17d9b2ddbdc3cd696b1d2ee3bf50de3f06875f6d73b7d0a9207a89065ec9"
S = "${WORKDIR}/rosidl_typesupport_opensplice-release-release-crystal-rosidl_typesupport_opensplice_cpp-0.6.2-0"

inherit ament


