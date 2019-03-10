# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Utilities to interface with <a href="http://gazebosim.org">Gazebo</a> through ROS."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "ament-cmake builtin-interfaces gazebo-dev gazebo-msgs geometry-msgs rclcpp sensor-msgs tinyxml-vendor"
SRC_URI = "https://github.com/ros2-gbp/gazebo_ros_pkgs-release/archive/release/crystal/gazebo_ros/3.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "caf8292eac0417465f20fcf15e01208f"
SRC_URI[sha256sum] = "55c32f791adc885962ddda4e80392a0c99d1cd9b3d65e3c751b9d5c0c8f41711"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-crystal-gazebo_ros-3.1.0-0"

inherit catkin
