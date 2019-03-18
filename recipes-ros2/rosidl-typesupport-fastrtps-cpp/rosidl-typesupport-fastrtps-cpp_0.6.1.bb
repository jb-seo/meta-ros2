# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the C++ interfaces for eProsima FastRTPS."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "fastrtps rmw rosidl-cmake rosidl-generator-c rosidl-generator-cpp rosidl-parser rosidl-typesupport-interface fastrtps-cmake-module"
SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_fastrtps-release/archive/release/crystal/rosidl_typesupport_fastrtps_cpp/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "757c432927e62f51dd7c9be4e7f26dbe"
SRC_URI[sha256sum] = "2daa01538507dddde0fb0cae9725c2a4410ffa22a8939dff2c562c4a6956a93e"
S = "${WORKDIR}/rosidl_typesupport_fastrtps-release-release-crystal-rosidl_typesupport_fastrtps_cpp-0.6.1-0"

inherit ament

