# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Implement the ROS middleware interface using eProsima FastRTPS static code generation in C++."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " rcutils rmw rmw-fastrtps-shared-cpp rosidl-cmake rosidl-generator-c rosidl-generator-cpp rosidl-typesupport-fastrtps-c rosidl-typesupport-fastrtps-cpp"
SRC_URI = "https://github.com/ros2-gbp/rmw_fastrtps-release/archive/release/crystal/rmw_fastrtps_cpp/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c494bcbe649a7d5a19def409660718f5"
SRC_URI[sha256sum] = "49af1fa79027dbaddc68a1d0595e6fcc3e50b2456516b216ea6d635ac6fd9a54"
S = "${WORKDIR}/rmw_fastrtps-release-release-crystal-rmw_fastrtps_cpp-0.6.1-0"

inherit ament
