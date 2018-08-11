# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Library which provides the 3D rendering functionality in rviz."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake ament-index-cpp eigen libqt5-core libqt5-gui libqt5-opengl libqt5-widgets qtbase5-dev resource-retriever rviz-assimp-vendor rviz-ogre-vendor"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/bouncy/rviz_rendering/4.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "717fac19f3444ee23234be17f1c681bd"
SRC_URI[sha256sum] = "46451b32bd0d80a41d123ff543fa2ad735e8df445eccc696427fdc65b086a7a5"
S = "${WORKDIR}/rviz-release-release-bouncy-rviz_rendering-4.0.1-0"

inherit catkin
