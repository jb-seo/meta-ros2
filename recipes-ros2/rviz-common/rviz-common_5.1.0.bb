# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common rviz API, used by rviz plugins and applications."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake geometry-msgs libqt5-core libqt5-gui libqt5-opengl libqt5-widgets pluginlib qtbase5-dev rclcpp resource-retriever rviz-assimp-vendor rviz-ogre-vendor rviz-rendering sensor-msgs std-msgs tf2 tf2-geometry-msgs tf2-ros tinyxml-vendor urdf yaml-cpp-vendor"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/crystal/rviz_common/5.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c46745c4662901e8d47374b8b07c8737"
SRC_URI[sha256sum] = "8fde07fc584f5c242e3849c258f00d85452c6507816c6ed6a9b543383b6d8d52"
S = "${WORKDIR}/rviz-release-release-crystal-rviz_common-5.1.0-0"

inherit catkin
