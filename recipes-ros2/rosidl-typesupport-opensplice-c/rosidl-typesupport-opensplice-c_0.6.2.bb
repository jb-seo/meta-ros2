# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the C interfaces for PrismTech OpenSplice."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " opensplice-cmake-module rmw rosidl-cmake rosidl-generator-c rosidl-parser rosidl-typesupport-opensplice-cpp"
SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_opensplice-release/archive/release/crystal/rosidl_typesupport_opensplice_c/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "24321b28826c3e9d58236a4d4e3aa3a8"
SRC_URI[sha256sum] = "f6e3ae3eea84339ae8aac7d55f55ab00f0e0f4bd1638dfe8dd55be167c634826"
S = "${WORKDIR}/rosidl_typesupport_opensplice-release-release-crystal-rosidl_typesupport_opensplice_c-0.6.2-0"

inherit ament


