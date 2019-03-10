# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ROS specific CMake bits in the ament buildsystem."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake_ros-release/archive/release/crystal/ament_cmake_ros/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e326124b340670178b6c39eed8c031ec"
SRC_URI[sha256sum] = "dbbe845687229efffa115f1d88111fb766276cb7eaf4dd8d55b91149e76f6349"
S = "${WORKDIR}/ament_cmake_ros-release-release-crystal-ament_cmake_ros-0.5.0-0"

inherit catkin
